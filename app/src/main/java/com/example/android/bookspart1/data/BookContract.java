package com.example.android.bookspart1.data;

import android.provider.BaseColumns;

public final class BookContract {
    public static abstract class BookEntry implements BaseColumns {

        // name of the table
        public static final String TABLE_NAME = "books";

        //schema for the table
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PRODUCT_NAME = "name";
        public static final String COLUMN_PRODUCT_TYPE = "type";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_SUPPLIER_NAME = "supplier";
        public static final String COLUMN_SUPPLIER_PHONE_NUMBER = "phone";

        // constants for product type
        public static final int HARDBACK = 0;
        public static final int PAPERBACK = 1;
        public static final int EBOOK = 2;
    }
}
