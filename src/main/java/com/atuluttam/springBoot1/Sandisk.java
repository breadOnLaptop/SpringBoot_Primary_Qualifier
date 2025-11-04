package com.atuluttam.springBoot1;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Sandisk implements HardDrive
{
       public void saveData()
       {
           System.out.println("data is save in Sandisk HDD");
       }
}
