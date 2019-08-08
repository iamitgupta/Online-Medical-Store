package com.cg.oms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
import com.cg.oms.services.OnlineMedicalStoreServices;
import com.cg.oms.services.OnlineMedicalStoreServicesImpl;

@Transactional
@Repository
public class OnlineMedicalStoreDAOImpl implements OnlineMedicalStoreDAO {

	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySQLUnit");

	@Override
	public Boolean registerCustomer(Customer customer) {
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
	public Cart addToCart(int productId,int productCount, int customerId) {
		// search if the user's cart already exists
		OnlineMedicalStoreServices service=new OnlineMedicalStoreServicesImpl();
		Cart cart = null;
		int slotNo = getCartAvailability(customerId);
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<Cart> query = em.createQuery("from Cart c where customerId= :cId", Cart.class);
			query.setParameter("cId", customerId);
			List<Cart> cartList= query.getResultList();
			if(cartList.size()>0)
			 {
				cart=cartList.get(0);
				if (slotNo == 1) {
					cart.setProduct1Id(productId);
					cart.setProduct1Count(0);
				} else if (slotNo == 2) {
					cart.setProduct2Id(productId);
					cart.setProduct2Count(0);
				} else if (slotNo == 3) {
					cart.setProduct2Id(productId);
					cart.setProduct3Count(0);
				}
			}
			//TO-DO
		//	cart.setTotal_price(service.calculatePrice(cart));
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// if the customer doesn't have cart create new cart
		if (cart == null) {
			cart = new Cart();
			try {
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
				cart.setCustomerId(customerId);
				cart.setProduct1Id(productId);
				cart.setProduct2Id(0);
				cart.setProduct2Id(0);
				//TO-DO
				//	cart.setTotal_price(service.calculatePrice(cart));
				em.persist(cart);
				em.getTransaction().commit();
				em.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cart;
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
		// search if the user's cart already exists
		// then return the available slot
		Cart cart = null;
		// 0 means no slot available
		int slotNo = 0;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			TypedQuery<Cart> query = em.createQuery("from Cart c where customerId= :cId", Cart.class);
			query.setParameter("cId", customerId);
			cart = query.getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
			if (cart!=null) {
				if (cart.getProduct1Id() == 0) {
					slotNo = 1;
				} else if (cart.getProduct2Id() == 0) {
					slotNo = 2;
				} else if (cart.getProduct3Id() == 0) {
					slotNo = 3;
				}
			}
		return slotNo;
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
