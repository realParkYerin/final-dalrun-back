package com.dalrun.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalrun.dto.DiaryDto;
import com.dalrun.dto.DiaryReplyDto;
import com.dalrun.service.DiaryReplyService;
import com.dalrun.service.DiaryService;

@RestController
public class DiaryController {

	@Autowired
	DiaryService dService;
	
	@Autowired
	DiaryReplyService drService;

	// 다이어리 리스트
	@GetMapping("getAllDiary")
	public List<DiaryDto> getAllDiary(){
		System.out.println("DiaryController getAllDiary" + new Date());
		return dService.getAllDiary();
	}

	// 다이어리 댓글 리스트
	@GetMapping("diaryReplyList")
	public List<DiaryReplyDto> diaryReplyList(){
		System.out.println("DiaryController diaryReplyList" + new Date());
		return drService.diaryReplyList();
	}

} // <Diary Controller/>