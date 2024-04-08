package com.mukund.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class<?> myClass = Class.forName(Calculator.class.getName());
		System.out.println(myClass);
//		// return all the constructors
//		Constructor<?>[] constructors = myClass.getConstructors();
//		System.out.println(Arrays.toString(constructors));
//		System.out.println(Arrays.toString(myClass.getMethods()));
//		// access particular constructor in your class if its more than one
//		try {
//			Constructor<?> constructor = myClass.getConstructor();
//			try {
//				Object newInstance = constructor.newInstance(null);
//				System.out.println("new instace is created using Reflection: " + newInstance);
//			} catch (InstantiationException e) {
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				e.printStackTrace();
//			}
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}

		// access parameterized constructor in your class
//
//		try {
//			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
//			try {
//				Object newInstance = constructor2.newInstance(50, 60);
//				System.out.println(newInstance);
//			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
//					| InvocationTargetException e) {
//				e.printStackTrace();
//			}
//		} catch (NoSuchMethodException | SecurityException e) {
//			e.printStackTrace();
//		}

		Constructor<?> cons3 = myClass.getConstructor(double.class, double.class);
		Object obj = cons3.newInstance(5, 10);
		// invoke setter method using reflection
		Method setNum1 = myClass.getMethod("setNum1", double.class);
		setNum1.invoke(obj, 6);
		
		Method setNum2 = myClass.getMethod("setNum2", double.class);
		setNum2.invoke(obj, 8);
		
		// accessing private field 
		Field numField = myClass.getDeclaredField("num1");
		numField.setAccessible(true);
		numField.set(obj, 99);
		
		
		// invoke getter method using reflection
		Method getmethod = myClass.getMethod("getNum1", null);
		Object invoke = getmethod.invoke(obj, null);
		System.out.println(invoke);

		Method getmethod2 = myClass.getMethod("getNum2", null);
		Object invoke2 = getmethod2.invoke(obj, null);
		System.out.println(invoke2);
		
		//--------------------------------------------------------------
		
		Method sumMethod = myClass.getMethod("sum", int.class, int.class);
		System.out.println(sumMethod.invoke(obj, 30,40));
		
		//--------------------------Annotations----------------------------------------
		
		Annotation[] annotations = myClass.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		
		MyAnnotation annotation =  (MyAnnotation) annotations[0];
		System.out.println(annotation.value1());
		System.out.println(annotation.value2());

	}

}
