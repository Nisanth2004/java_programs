package org.example.nisanth;

public record StudentRecord(Long id,String name,String email)
{
                   // FACTS ABOUT RECORDS

    // cannot be inherited or extend beacusr it alreday extend record class bit it can be implemented
    // all the variable are in final it cannot be changed
    //record cannot be subclass -> they are final by default
    // JVM Create Autpmatically generated ALLArgsConstructor,getter,hashcode,tostring,equals except setter
    // setter can,t be allowed because setter is used to changed the variable content
    // name is not null
     public StudentRecord
     {
         if (name==null||name.isBlank())
         {
             throw new IllegalArgumentException("Name can not be empty");
         }
     }
}
