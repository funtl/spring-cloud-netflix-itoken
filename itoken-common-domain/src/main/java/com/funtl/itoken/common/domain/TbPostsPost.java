package com.funtl.itoken.common.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_posts_post")
public class TbPostsPost extends BaseDomain implements Serializable {
    private static final long serialVersionUID = -1155857614254485986L;

    /**
     * 文章编码
     */
    @Id
    @Column(name = "post_guid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String postGuid;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章发布时间
     */
    @Column(name = "time_published")
    private Date timePublished;

    /**
     * 文章状态（0草稿 1已发布的文章 2待审核的文章 3被拒绝文章 4定时发布的文章）
     */
    private String status;

    /**
     * 文章别名
     */
    private String alias;

    /**
     * 文章得分
     */
    private Short score;

    /**
     * 被赞数
     */
    @Column(name = "number_of_upvotes")
    private Integer numberOfUpvotes;

    /**
     * 被踩数
     */
    @Column(name = "number_of_downvotes")
    private Integer numberOfDownvotes;

    /**
     * 被阅读数
     */
    @Column(name = "number_of_reads")
    private Integer numberOfReads;

    /**
     * 被分享数
     */
    @Column(name = "number_of_shares")
    private Integer numberOfShares;

    /**
     * 被收藏数
     */
    @Column(name = "number_of_bookmarks")
    private Integer numberOfBookmarks;

    /**
     * 被评论数
     */
    @Column(name = "number_of_comments")
    private Integer numberOfComments;

    /**
     * 文章审核被拒理由
     */
    @Column(name = "reject_msg")
    private String rejectMsg;

    /**
     * 文章的阅读权限（0无限制 1会员）
     */
    private String access;

    /**
     * 文章摘要
     */
    private String summary;

    /**
     * 文章正文
     */
    private String main;

    /**
     * 文章作者对象
     */
    private String authors;

    /**
     * 封面缩略图片
     */
    @Column(name = "thumb_image")
    private String thumbImage;

    /**
     * 裁剪后不带尺寸的正文图片数组
     */
    @Column(name = "original_images")
    private String originalImages;

    /**
     * 裁剪后带尺寸的正文图片数组
     */
    private String images;

    /**
     * 裁剪前的正文图片数组
     */
    @Column(name = "full_size_images")
    private String fullSizeImages;

    /**
     * 文章标签
     */
    private String tags;

    /**
     * 文章特色标签
     */
    @Column(name = "v_tags")
    private String vTags;

    /**
     * 一篇文章的系列集合
     */
    private String series;

    /**
     * 获取文章编码
     *
     * @return post_guid - 文章编码
     */
    public String getPostGuid() {
        return postGuid;
    }

    /**
     * 设置文章编码
     *
     * @param postGuid 文章编码
     */
    public void setPostGuid(String postGuid) {
        this.postGuid = postGuid;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文章发布时间
     *
     * @return time_published - 文章发布时间
     */
    public Date getTimePublished() {
        return timePublished;
    }

    /**
     * 设置文章发布时间
     *
     * @param timePublished 文章发布时间
     */
    public void setTimePublished(Date timePublished) {
        this.timePublished = timePublished;
    }

    /**
     * 获取文章状态（0草稿 1已发布的文章 2待审核的文章 3被拒绝文章 4定时发布的文章）
     *
     * @return status - 文章状态（0草稿 1已发布的文章 2待审核的文章 3被拒绝文章 4定时发布的文章）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置文章状态（0草稿 1已发布的文章 2待审核的文章 3被拒绝文章 4定时发布的文章）
     *
     * @param status 文章状态（0草稿 1已发布的文章 2待审核的文章 3被拒绝文章 4定时发布的文章）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取文章别名
     *
     * @return alias - 文章别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置文章别名
     *
     * @param alias 文章别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取文章得分
     *
     * @return score - 文章得分
     */
    public Short getScore() {
        return score;
    }

    /**
     * 设置文章得分
     *
     * @param score 文章得分
     */
    public void setScore(Short score) {
        this.score = score;
    }

    /**
     * 获取被赞数
     *
     * @return number_of_upvotes - 被赞数
     */
    public Integer getNumberOfUpvotes() {
        return numberOfUpvotes;
    }

    /**
     * 设置被赞数
     *
     * @param numberOfUpvotes 被赞数
     */
    public void setNumberOfUpvotes(Integer numberOfUpvotes) {
        this.numberOfUpvotes = numberOfUpvotes;
    }

    /**
     * 获取被踩数
     *
     * @return number_of_downvotes - 被踩数
     */
    public Integer getNumberOfDownvotes() {
        return numberOfDownvotes;
    }

    /**
     * 设置被踩数
     *
     * @param numberOfDownvotes 被踩数
     */
    public void setNumberOfDownvotes(Integer numberOfDownvotes) {
        this.numberOfDownvotes = numberOfDownvotes;
    }

    /**
     * 获取被阅读数
     *
     * @return number_of_reads - 被阅读数
     */
    public Integer getNumberOfReads() {
        return numberOfReads;
    }

    /**
     * 设置被阅读数
     *
     * @param numberOfReads 被阅读数
     */
    public void setNumberOfReads(Integer numberOfReads) {
        this.numberOfReads = numberOfReads;
    }

    /**
     * 获取被分享数
     *
     * @return number_of_shares - 被分享数
     */
    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * 设置被分享数
     *
     * @param numberOfShares 被分享数
     */
    public void setNumberOfShares(Integer numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    /**
     * 获取被收藏数
     *
     * @return number_of_bookmarks - 被收藏数
     */
    public Integer getNumberOfBookmarks() {
        return numberOfBookmarks;
    }

    /**
     * 设置被收藏数
     *
     * @param numberOfBookmarks 被收藏数
     */
    public void setNumberOfBookmarks(Integer numberOfBookmarks) {
        this.numberOfBookmarks = numberOfBookmarks;
    }

    /**
     * 获取被评论数
     *
     * @return number_of_comments - 被评论数
     */
    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    /**
     * 设置被评论数
     *
     * @param numberOfComments 被评论数
     */
    public void setNumberOfComments(Integer numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    /**
     * 获取文章审核被拒理由
     *
     * @return reject_msg - 文章审核被拒理由
     */
    public String getRejectMsg() {
        return rejectMsg;
    }

    /**
     * 设置文章审核被拒理由
     *
     * @param rejectMsg 文章审核被拒理由
     */
    public void setRejectMsg(String rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    /**
     * 获取文章的阅读权限（0无限制 1会员）
     *
     * @return access - 文章的阅读权限（0无限制 1会员）
     */
    public String getAccess() {
        return access;
    }

    /**
     * 设置文章的阅读权限（0无限制 1会员）
     *
     * @param access 文章的阅读权限（0无限制 1会员）
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * 获取文章摘要
     *
     * @return summary - 文章摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置文章摘要
     *
     * @param summary 文章摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取文章正文
     *
     * @return main - 文章正文
     */
    public String getMain() {
        return main;
    }

    /**
     * 设置文章正文
     *
     * @param main 文章正文
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * 获取文章作者对象
     *
     * @return authors - 文章作者对象
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * 设置文章作者对象
     *
     * @param authors 文章作者对象
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * 获取封面缩略图片
     *
     * @return thumb_image - 封面缩略图片
     */
    public String getThumbImage() {
        return thumbImage;
    }

    /**
     * 设置封面缩略图片
     *
     * @param thumbImage 封面缩略图片
     */
    public void setThumbImage(String thumbImage) {
        this.thumbImage = thumbImage;
    }

    /**
     * 获取裁剪后不带尺寸的正文图片数组
     *
     * @return original_images - 裁剪后不带尺寸的正文图片数组
     */
    public String getOriginalImages() {
        return originalImages;
    }

    /**
     * 设置裁剪后不带尺寸的正文图片数组
     *
     * @param originalImages 裁剪后不带尺寸的正文图片数组
     */
    public void setOriginalImages(String originalImages) {
        this.originalImages = originalImages;
    }

    /**
     * 获取裁剪后带尺寸的正文图片数组
     *
     * @return images - 裁剪后带尺寸的正文图片数组
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置裁剪后带尺寸的正文图片数组
     *
     * @param images 裁剪后带尺寸的正文图片数组
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 获取裁剪前的正文图片数组
     *
     * @return full_size_images - 裁剪前的正文图片数组
     */
    public String getFullSizeImages() {
        return fullSizeImages;
    }

    /**
     * 设置裁剪前的正文图片数组
     *
     * @param fullSizeImages 裁剪前的正文图片数组
     */
    public void setFullSizeImages(String fullSizeImages) {
        this.fullSizeImages = fullSizeImages;
    }

    /**
     * 获取文章标签
     *
     * @return tags - 文章标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置文章标签
     *
     * @param tags 文章标签
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取文章特色标签
     *
     * @return v_tags - 文章特色标签
     */
    public String getvTags() {
        return vTags;
    }

    /**
     * 设置文章特色标签
     *
     * @param vTags 文章特色标签
     */
    public void setvTags(String vTags) {
        this.vTags = vTags;
    }

    /**
     * 获取一篇文章的系列集合
     *
     * @return series - 一篇文章的系列集合
     */
    public String getSeries() {
        return series;
    }

    /**
     * 设置一篇文章的系列集合
     *
     * @param series 一篇文章的系列集合
     */
    public void setSeries(String series) {
        this.series = series;
    }
}