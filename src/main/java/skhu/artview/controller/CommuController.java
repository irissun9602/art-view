package skhu.artview.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api")
public class CommuController {


	/*작성자: 남하영
	임시 코드, mapper, 게시글 테이블 등 추가해야 함*/
	//article 폼(수정시)
	/*@RequestMapping(value = "commu_article", method = RequestMethod.GET)
	public String commu_submit(Model model, @RequestParam(value = "id") int id) {
		Article article = articleMapper.findOne(id);
		model.addAttribute("article", article);
		return "commu_article";
	}*/

	//article 폼(작성시)
	/*@RequestMapping(value = "commu_article", method = RequestMethod.POST)
	public String commu_submit(Model model) {
		Article article = new Article();
		User user = UserService.getCurrentUser(); //현재 유저 정보 받아오기
		article.setID(user.getId()); //현재 유저 정보 객체에 삽입
		articleMapper.insert(article);
		return "commu_article";
	}*/
}
