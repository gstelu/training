����   > N  training/outerele  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ltraining/outerele; outer ([[III)V	    java/lang/System   out Ljava/io/PrintStream;  OuterElements
    java/io/PrintStream   println (Ljava/lang/String;)V   
  ! "  print $ java/lang/StringBuilder
 & ( ' java/lang/String ) * valueOf (I)Ljava/lang/String;
 # ,  
 # . / 0 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # 2 3 4 toString ()Ljava/lang/String;
  6   a [[I n I m i j StackMapTable main ([Ljava/lang/String;)V B [I D Array
  	
  G   args [Ljava/lang/String; obj 8 
SourceFile outerele.java !               /     *� �    
                          <     �� � 6� �6� q� � � �  � W� d� `� ;� d� `� %� � #Y+2.� %� +� -� 1�  � 	� � 5�+2�����+���{�    
   6    	  
        (  +  W  v  y    � 
 �     >    �       � 7 8    � 9 :    � ; :   � < :   { = :  >    	� � !�  	 ? @    J     �� AY�
YOYOSY�
YOYOYOYOSY�
YOYOYOYOYOSY�
YOYOYOYOYOSL� C� =� 9>� #� � #Y+2.� %� +� -� 1�  �+2���۲ � 5�+���ǻ Y� EM,+� F�    
   .     `  h  m   r " �   � # �  � % � & � '    4    � H I   ` Y 7 8  j ? < :  o + = :  �  J   >    � m K� �   L    M