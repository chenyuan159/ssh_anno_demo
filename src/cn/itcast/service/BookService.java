package cn.itcast.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.BookDao;

@Service(value="bookService")
@Transactional
public class BookService {

	@Resource(name="bookDaoImpl")
	private BookDao bookDao;

	public void add() {
		System.out.println("service........");
		bookDao.add();
	}
	
}
