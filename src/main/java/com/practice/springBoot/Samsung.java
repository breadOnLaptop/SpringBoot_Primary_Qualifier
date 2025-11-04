package com.practice.springBoot;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung implements HardDrive
{
       public void saveData()
       {
           System.out.println("data is save in Samsung HDD");
       }
}
