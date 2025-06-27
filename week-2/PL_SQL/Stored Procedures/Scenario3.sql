CREATE OR REPLACE PROCEDURE TransferFunds (
  from_account_id IN NUMBER,
  to_account_id IN NUMBER,
  transfer_amount IN NUMBER
) IS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    source_balance NUMBER;
  BEGIN
    SELECT balance INTO source_balance
    FROM accounts
    WHERE account_id = from_account_id;

    IF source_balance < transfer_amount THEN
      RAISE insufficient_balance;
    END IF;
  END;

  UPDATE accounts
  SET balance = balance - transfer_amount
  WHERE account_id = from_account_id;

  UPDATE accounts
  SET balance = balance + transfer_amount
  WHERE account_id = to_account_id;

  COMMIT;

EXCEPTION
  WHEN insufficient_balance THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
  WHEN NO_DATA_FOUND THEN
    RAISE_APPLICATION_ERROR(-20002, 'One or both account IDs not found');
END;
/
