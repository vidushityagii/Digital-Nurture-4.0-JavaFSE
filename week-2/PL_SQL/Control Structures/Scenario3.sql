BEGIN
  FOR loan_rec IN (
    SELECT customer_id, due_date
    FROM loans
    WHERE due_date <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || loan_rec.customer_id || ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
  END LOOP;
END;
