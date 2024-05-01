package com.sparta.finalticket.domain.review.dto.response;

import com.sparta.finalticket.domain.review.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponseDto {

    private Long id;
    private String review;
    private Long score;
    private Boolean state;
    private Long userId;
    private Long gameId;
    private Long likeCount;
    private Long dislikeCount;
    private Long recommendationCount;

    public ReviewResponseDto(Review review) {
        this.id = review.getId();
        this.review = review.getReview();
        this.score = review.getScore();
        this.state = review.getState();
        this.userId = review.getUser() != null ? review.getUser().getId() : null;
        this.gameId = review.getGame() != null ? review.getGame().getId() : null;
        this.likeCount = review.getLikeCount();
        this.dislikeCount = review.getDislikeCount();
        this.recommendationCount = review.getRecommendationCount();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public void setRecommendationCount(Long recommendationCount) {
        this.recommendationCount = recommendationCount;
    }
}

