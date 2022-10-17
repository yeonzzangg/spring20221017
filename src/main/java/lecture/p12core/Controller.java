package lecture.p12core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
//	set메소드, 생성자, 필드 중 1
	@Autowired
	private Service service;
	
	public Service getService() {
		return service;
	}
}
