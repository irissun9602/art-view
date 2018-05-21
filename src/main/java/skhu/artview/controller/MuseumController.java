package skhu.artview.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import skhu.artview.model.Item;
import skhu.artview.service.MuseumService;

@RestController
@CrossOrigin
@RequestMapping("api")
public class MuseumController {

	@Autowired
	MuseumService service;

	@RequestMapping("bookList")
		   public List<Item> bookList(@RequestParam(required=false)String keyword){

			keyword="java";

		       return service.searchItem(keyword,1,10);
		   }
}
