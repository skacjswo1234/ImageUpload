package com.cos.pic;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestController {
    
    @GetMapping("/send")
    public String send(){
        return "send";
    }

    @GetMapping("/feed")
    public String feed(){
        return "feed";
    }

    @PostMapping("/image")
    public @ResponseBody String image(MultipartFile pic){
        UUID uuid = UUID.randomUUID();
        
        String imageFileName = uuid+"_"+pic.getOriginalFilename();

        String path = "F:/springboot/workspace/upload/";

        Path imagePath = Paths.get(path+imageFileName);

        try {
            Files.write(imagePath, pic.getBytes());
            // DB에 파일 경로를 저장!! imageFileName 저장하기
        } catch (Exception e) {
            e.printStackTrace();
        }


        return imageFileName;
    }
}
