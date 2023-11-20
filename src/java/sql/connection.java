/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.sql;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ragam
 */
public class connection {
    private static Connection koneksi;
    private static Object DriverManager;
    private static Object m;
    public static Connection sambung(){
            try{
                MysqlDatacontroller = new MysqlDataconterller();
                m.setUsername ("root");
                m.setPassword("");
                m.setDriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            }
    
}
