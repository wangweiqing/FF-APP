PGDMP                         r            bookshop    9.3.1    9.3.1     4           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            5           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            6           1262    16395    bookshop    DATABASE     z   CREATE DATABASE bookshop WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';
    DROP DATABASE bookshop;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            7           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    5            8           0    0    public    ACL     �   REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;
                  postgres    false    5            �            3079    12670    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            9           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    173            �            1259    16407    account    TABLE     �   CREATE TABLE account (
    username character varying(50) NOT NULL,
    balance integer NOT NULL,
    CONSTRAINT account_balance_check CHECK ((balance >= 0))
);
    DROP TABLE public.account;
       public         weiqingwang    false    5            �            1259    16396    book    TABLE     �   CREATE TABLE book (
    isbn character varying(50) NOT NULL,
    book_name character varying(100) NOT NULL,
    price integer
);
    DROP TABLE public.book;
       public         weiqingwang    false    5            �            1259    16401 
   book_stock    TABLE     �   CREATE TABLE book_stock (
    isbn character varying(50) NOT NULL,
    stock integer NOT NULL,
    CONSTRAINT book_stock_stock_check CHECK ((stock >= 0))
);
    DROP TABLE public.book_stock;
       public         weiqingwang    false    5            1          0    16407    account 
   TABLE DATA               -   COPY account (username, balance) FROM stdin;
    public       weiqingwang    false    172   �       /          0    16396    book 
   TABLE DATA               /   COPY book (isbn, book_name, price) FROM stdin;
    public       weiqingwang    false    170   �       0          0    16401 
   book_stock 
   TABLE DATA               *   COPY book_stock (isbn, stock) FROM stdin;
    public       weiqingwang    false    171   �       �
           2606    16412    account_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY account
    ADD CONSTRAINT account_pkey PRIMARY KEY (username);
 >   ALTER TABLE ONLY public.account DROP CONSTRAINT account_pkey;
       public         weiqingwang    false    172    172            �
           2606    16400 	   book_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY book
    ADD CONSTRAINT book_pkey PRIMARY KEY (isbn);
 8   ALTER TABLE ONLY public.book DROP CONSTRAINT book_pkey;
       public         weiqingwang    false    170    170            �
           2606    16406    book_stock_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY book_stock
    ADD CONSTRAINT book_stock_pkey PRIMARY KEY (isbn);
 D   ALTER TABLE ONLY public.book_stock DROP CONSTRAINT book_stock_pkey;
       public         weiqingwang    false    171    171            1      x�+-N-2�42������       /   $   x�3000��HUp�,*.Qp����46������ k��      0      x�3000�44������ ��     