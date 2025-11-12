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


@PutMapping("/update/{id}")
public ResponseEntity<?> upDate(@PathVariable int id ,@RequestBody @Valid Article article , Errors errors){
        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(errors);
        }

        return ResponseEntity.status(200).body(new ApiResponse("update article"));
}
@DeleteMapping("delete/{index}")
public ResponseEntity<?> deleteArticle(@PathVariable int index , Errors  errors ){
        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(errors);
        }
        return ResponseEntity.status(200).body(new ApiResponse("delete Article "));
    }
    @PutMapping("/publish/{id}")
    public boolean publishArticle(@PathVariable int id ,@RequestBody Article article){
        if (publishArticle(id, article)){
            return ResponseEntity.status(400).body(publishArticle(id, article));
        }
        return ResponseEntity.status(200).body(new ApiResponse("publishArticle"));
    }
    @GetMapping("/publish")
    public ResponseEntity<?> getPublished(){
        return ResponseEntity.status(200).body(new ApiResponse("publish"));
    }
    @GetMapping("/category")
        public ResponseEntity<?> getByCategory(@PathVariable String category){
return ResponseEntity.status(200).body(getByCategory(category));
        }


}
