BEGIN
  FOR cust_rec IN (
    SELECT customer_id, balance
    FROM customers
  ) LOOP
    IF cust_rec.balance > 10000 THEN
      UPDATE customers
      SET isVIP = 'TRUE'
      WHERE customer_id = cust_rec.customer_id;
    END IF;
  END LOOP;
  COMMIT;
END;
