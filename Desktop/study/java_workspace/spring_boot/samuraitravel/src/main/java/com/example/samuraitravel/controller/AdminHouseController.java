package com.example.samuraitravel.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;

@Controller // コントローラの宣言
@RequestMapping("/admin/houses") //このコントローラが"/admin/houses" パス以下のリクエストを処理処理する
public class AdminHouseController { //クラス定義
    private final HouseRepository houseRepository; //依存先のオブジェクトをfinalで宣言        
   //コンストラクタインジェクションで依存性注入
    public AdminHouseController(HouseRepository houseRepository) { 
        this.houseRepository = houseRepository;           
    }	
    
    @GetMapping //index()でhouseRepositoryのデータ取得
    public String index(Model model, Pageable pageable ) {
    	Page<House> housePage = houseRepository.findAll(pageable); 
    	
    	model.addAttribute("housePage", housePage);              
        
        return "admin/houses/index";
    }  
}
