package com.cg.oms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.oms.beans.Admin;
import com.cg.oms.beans.AdminMessage;
import com.cg.oms.beans.Card;
import com.cg.oms.beans.Cart;
import com.cg.oms.beans.Customer;
import com.cg.oms.beans.CustomerAddress;
import com.cg.oms.beans.CustomerMessage;
import com.cg.oms.beans.Order;
import com.cg.oms.beans.Product;
import com.cg.oms.dao.OnlineMedicalStoreDAO;
import com.cg.oms.dao.OnlineMedicalStoreDAOImpl;

@Service
public class OnlineMedicalStoreServicesImpl  implements OnlineMedicalStoreServices{

	OnlineMedicalStoreDAO dao=new OnlineMedicalStoreDAOImpl();

	@Override
	public Boolean registerCustomer(Customer customer) {
		return null;
	}

	@Override
	public Customer loginCustomer(int customerId, String password) {
		return null;
	}

	@Override
	public Boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePassword(int customerId, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addAddress(CustomerAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerAddress updateAddress(CustomerAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin adminLogin(int adminId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order placeOrder(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelOrder(int orderId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addToCart(int productId, int customerId) {
		return dao.addToCart(productId, customerId);
	}

	@Override
	public Cart removeFromCart(int productId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart displayCart(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendMessageToCustomer(AdminMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerMessage> getCustomerMSG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendMessageToAdmin(CustomerMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminMessage> getAdminMSG(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validateCard(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculatePrice(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}
}
