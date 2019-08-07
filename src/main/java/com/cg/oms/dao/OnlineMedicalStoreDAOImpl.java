package com.cg.oms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.oms.beans.Admin;
import com.cg.oms.beans.AdminMessage;
import com.cg.oms.beans.Cart;
import com.cg.oms.beans.Customer;
import com.cg.oms.beans.CustomerAddress;
import com.cg.oms.beans.CustomerMessage;
import com.cg.oms.beans.Order;
import com.cg.oms.beans.Product;
@Transactional
@Repository
public class OnlineMedicalStoreDAOImpl implements OnlineMedicalStoreDAO{
	
	public static final EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("MySQLUnit");

	@Override
	public Boolean registerCustomer(Customer customer) {
		EntityManager em =  emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return null;
	}

	@Override
	public Customer loginCustomer(int customerId, String password) {
		// TODO Auto-generated method stub
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
		return null;
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
	public Integer getCartAvailability(int customerId) {
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

	
}
