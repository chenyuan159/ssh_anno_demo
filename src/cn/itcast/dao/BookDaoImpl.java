package cn.itcast.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Controller;

import cn.itcast.entity.Book;

@Controller(value="bookDaoImpl")
public class BookDaoImpl implements BookDao {

	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void add() {
		System.out.println("dao...........");
		Book book = new Book();
		book.setBname("易筋经");
		book.setPrice("免费");
		hibernateTemplate.save(book);
	}

}
