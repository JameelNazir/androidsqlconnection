package com.example.mailsender;

import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;

public class sqlConnection {
    public   static  String  ip="192.168.10.31";
    public   static  String  port="1433";
    public static String Classes = "net.sourceforge.jtds.jdbc.Driver";

    public static String database = "FQMS-AC-RCS";// the data base name
    public static String username = "sa";// the user name
    public static String password = "sa";// the password
    public static String url = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+database;

    public Connection connection = null;

    public void setConnection()    {
    }

}
