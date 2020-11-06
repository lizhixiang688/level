package com.company;



public class Taotao extends Person {
   public Taotao(){
       super("涛涛学姐",18);
   }
                                                    //不覆写方法sleep
   public void playGame(){                          //添加父类中没有的方法
       System.out.println(getName()+"在游戏里疯狂带飞");
   }

   public void study(){                             //拓展父类方法
       super.study();
       System.out.println(getName()+"直接绩点4.0");
   }
   public void eat(){                               //覆写方法
       System.out.println(getName()+"在吃着美味的榴莲");
   }

}
