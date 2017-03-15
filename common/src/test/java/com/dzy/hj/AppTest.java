package com.dzy.hj;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dzy.hj.entity.BaseGenericResponse;
import com.dzy.hj.entity.CategoryResponse;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void testFastJackSon(){
        try {
            InputStream inputStream=new FileInputStream(new File("d://test.json"));
            String s = IOUtils.toString(inputStream);
            System.out.println(s);
            ObjectMapper mapper=new ObjectMapper();
            JSONObject parse= (JSONObject) JSON.parse(s);
            System.out.println(parse);
            CategoryResponse categoryResponse = JSON.parseObject(s, CategoryResponse.class);
            System.out.println(categoryResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
