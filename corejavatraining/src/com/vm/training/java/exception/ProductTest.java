package com.vm.training.java.exception;

public class ProductTest {

	public static void main(String[] args) {
		Product product =new Product();
		product.setId(10);
		product.setName("ball");
		product.setNoofdays(2);
		product.setProduct_Recived("no");
		product.setHow_is_product("not well");
		// TODO Auto-generated method stub
		try {
			if(product.getHow_is_product()=="not well")
			{
				throw new ProductDamaged("Product is damage");
			}
		}
			catch(ProductDamaged e)
			{
				e.printStackTrace();
			}
		try {
			if(product.getNoofdays()>3)
			{
				throw new ProductRefund("refunding the product");
			}
		}
			catch(ProductRefund e)
			{
				e.printStackTrace();
			}
		try {
			if(product.getProduct_Recived()=="no")
			{
				throw new ProductDidntReceive("Product is damage");
			}
		}
			catch(ProductDidntReceive e)
			{
				e.printStackTrace();
			}
		}

	}


