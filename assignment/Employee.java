����   > G  assignment/Employee  java/lang/Object id I name Ljava/lang/String; salary Ljava/lang/Long; designation getId ()I Code	     LineNumberTable LocalVariableTable this Lassignment/Employee; setId (I)V getName ()Ljava/lang/String;	     setName (Ljava/lang/String;)V 	getSalary ()Ljava/lang/Long;	    	 
 	setSalary (Ljava/lang/Long;)V getDesignation	  %   setDesignation <init> 8(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
  * ' + ()V toString . java/lang/StringBuilder 0 
Employee Details :
ID: 
 - 2 ' 
 - 4 5 6 append (I)Ljava/lang/StringBuilder; 8 
Name: 
 - : 5 ; -(Ljava/lang/String;)Ljava/lang/StringBuilder; = 	
Salary: 
 - ? 5 @ -(Ljava/lang/Object;)Ljava/lang/StringBuilder; B 
Designation: 
 - D ,  
SourceFile Employee.java !                    	 
         
        /     *� �           	                    >     *� �       
                                /     *� �                               >     *+� �       
                                /     *� �                         ! "     >     *+� �       
                      	 
   #      /     *� $�                         &      >     *+� $�       
                          ' (     �     *� )*� *,� *-� *� $�              ! 	 "  #  $  %    4                        	 
         ,      b     8� -Y/� 1*� � 37� 9*� � 9<� 9*� � >A� 9*� $� 9� C�           (        8      E    F