package com.mukund.immutable;

final class MyImmutable {

	private final int x ;
	
	MyImmutable(int x){
		this.x = x;
	}
	
	public MyImmutable change(int x) {
		if(this.x == x) {
			return this;
		}else {
			return new MyImmutable(x);
		}
		
	}
	
	public static void main(String[] args) {
		
		MyImmutable immutable = new MyImmutable(20);
		MyImmutable im = immutable.change(40);
		System.out.println(im == immutable);
		
		
	}
}


