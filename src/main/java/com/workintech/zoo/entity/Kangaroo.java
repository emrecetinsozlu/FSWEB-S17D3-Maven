package com.workintech.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kangaroo {
   private Integer id;
   private String name;
   private Double height;
   private Double weight;
   private String gender;
   private boolean isAggresive;

   public boolean getIsAggressive(){
      return isAggresive;
   }
   public void setIsAggressive(boolean aggresive){
      this.isAggresive = aggresive;
   }


   public void setName(String name){
      this.name = name;
   }
}
