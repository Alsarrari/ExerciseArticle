package com.springbooteventsystem.managementsystem.Model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Article {


    @NotNull(message = "id cannot by null")
    @NotNull(message = "title cannot by null")
    @Max(value = 100, message = "mazimumm is 100 characters")
    private String id;
    @NotNull(message = "outher cannot by null")
    @Size(min = 4, message = " sise is 4 and more ")
    @Size(max = 20 , message = "characters is 20")
    private String outhor;
    @NotNull(message = "content by null")
    @Pattern(
            regexp = "^.{201,}$",
            message = "must be more than 200 characters"
    )
    private String content;
    @NotNull(message = "category by null")
    @Pattern(
            regexp = "^(?i)(politics|sports|technology)$",
            message = "must be either politics, sports, or technology"
    )


    private String category;

    @NotNull(message = "image not null")
    private String imageUrl;

    private boolean isPublished = false;

    private String publishDate;


}
