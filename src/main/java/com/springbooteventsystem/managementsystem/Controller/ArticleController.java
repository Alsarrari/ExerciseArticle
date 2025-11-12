package com.springbooteventsystem.managementsystem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/a1/article")
public class ArticleController {
  
    @GetMapping("/get")
    public ResponseEntity<?> getAllArticle(){

        return ResponseEntity.status(200).body("get All Article");
    }

}
public ResponseEntity<?> addArticle(@RequestBody @Valid Article article , Errors errors ){
if (errors.hasErrors()){
    return ResponseEntity.status(400).body(errors);
}
return ResponseEntity.status(200).body("added article");



}
