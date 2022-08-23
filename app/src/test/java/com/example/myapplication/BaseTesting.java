package com.example.myapplication;

import android.content.Context;

import org.junit.After;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BaseTesting {

    public String description = "Default Description";

    @Mock
    public Context context = Mockito.mock(Context.class);

    @After
    public void sendDescription(){
        System.out.print(description +":");
        description = "No description found";
    }
}
