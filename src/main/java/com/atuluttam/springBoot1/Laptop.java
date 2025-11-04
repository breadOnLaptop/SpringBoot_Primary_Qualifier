package com.atuluttam.springBoot1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop
{
        //@Autowired
        private HardDrive hardDrive;


        @Autowired
        public void setHardDrive(@Qualifier("sandisk") HardDrive hardDrive)
        {
                this.hardDrive = hardDrive;
        }

        public void writeCode()
        {
            hardDrive.saveData();
        }
}
