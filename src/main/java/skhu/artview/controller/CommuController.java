package skhu.artview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import skhu.artview.service.CommuService;

@RestController
@CrossOrigin
@RequestMapping("api")
public class CommuController {

	@Autowired CommuService commuService;

	/*작성자: 남하영
	임시 코드, mapper, 파일 테이블 등 추가해야 함*/

	//전체 프로젝트 조회(메인 출력)
	/*@RequestMapping("projects")
	public List<P_exhibition> projects() {
		return projecyMapper.findAll();
	}*/

	//프로젝트 조회
	/*@RequestMapping("project/{id}")
	public Project commu_submit(@PathVariable("id") int id) {
		Project project = projectMapper.findOne(id);
		return project;
	}*/

	//프로젝트 작성
	/*@RequestMapping(value = "project", method = RequestMethod.POST)
	public String submit(@RequestBody Project project) {
		User user = UserService.getCurrentUser(); //현재 유저 정보 받아오기
		project.add(user.getId());
		projectMapper.insert(project);
		return "등록되었습니다";
	}*/

	//프로젝트 삭제
	/*@RequestMapping(value = "project/{id}", method = RequestMethod.DELETE)
	public String projectDelete(@PathVariable("id") int id) {
		projectMapper.delete(id);
		return "삭제되었습니다";
	}*/

}
