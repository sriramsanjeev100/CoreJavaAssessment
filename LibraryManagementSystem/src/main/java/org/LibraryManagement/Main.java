package org.LibraryManagement;

import org.LibraryManagement.util.HibernateUtil;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Starting Library Management System...");
        HibernateUtil.getSessionFactory();
        System.out.println("Hibernate Connected Successfully");
        HibernateUtil.shutdown();
    }
}