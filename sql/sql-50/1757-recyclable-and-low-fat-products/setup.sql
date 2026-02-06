-- 1. Create the table with constraints to mimic ENUM behavior
CREATE TABLE Products
(
    product_id INT PRIMARY KEY,
    low_fats   TEXT CHECK (low_fats IN ('Y', 'N')),
    recyclable TEXT CHECK (recyclable IN ('Y', 'N'))
);

-- 2. Insert the example data from the problem description
INSERT INTO Products (product_id, low_fats, recyclable)
VALUES (0, 'Y', 'N'),
       (1, 'Y', 'Y'),
       (2, 'N', 'Y'),
       (3, 'Y', 'Y'),
       (4, 'N', 'N');

-- 3. Verify the data was inserted correctly
SELECT *
FROM Products;