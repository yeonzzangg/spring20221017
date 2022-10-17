package lecture.p01lombok;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // 아래 5개의 어노테이션을 한번에 적용함
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
//@RequiredArgsConstructor
public class JavaBean5 {
	private String name;
	private int age;
}
