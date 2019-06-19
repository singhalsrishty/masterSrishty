package controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import beans.PageContent;

@RestController
@RequestMapping("/v1/datascience")
public class DataScienceController {
	
	/**
	 * @return
	 */
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public @ResponseBody PageContent getPageData() {
		PageContent pageContent = new PageContent();
		pageContent.setAuthorName("Srishty");
		pageContent.setTodayDate(new Date());
		pageContent.setTopic("How to Learn Data Science : For Beginners");
		return pageContent;
	}

}
