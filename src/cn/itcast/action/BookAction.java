package cn.itcast.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.service.BookService;

@Component("bookAction")
@Scope(value="prototype")
public class BookAction extends ActionSupport {

	@Resource(name="bookService")
	private BookService bookService;
	
	public String execute() throws Exception {
		System.out.println("action.......");
		bookService.add();
		return NONE;
	}
}
