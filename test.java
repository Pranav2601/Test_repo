package test; 

import java.net.HttpURLConnection; 
import java.net.URL; 
import java.net.URLConnection; 

public class Test 
{ 
public Test() 
{ 
try { 
String us = "http://www.fff.at/fff/dance/music/"; 
URL u = new URL(us); 
URLConnection con = u.openConnection(); 
HttpURLConnection hcon = (HttpURLConnection) con; 
hcon.setInstanceFollowRedirects(true); 
con.connect(); 
int responseCode = hcon.getResponseCode(); 
System.err.println("Got response code: " + responseCode); 



} catch (Exception ex) { 
System.err.println("Exception: " + ex); 
} 
} 

public static void main(String[] args) 
{ 
new Test(); 
} 
} 