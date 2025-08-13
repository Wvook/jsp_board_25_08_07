package boundedContext.base.controller;

import boundedContext.article.controller.ArticleController;
import boundedContext.member.MemberController;

public class Container {
    public static MemberController memberController;
    public static ArticleController articleController;

    // TODO 이부분이 뭘까... 찾아보자
    static {
        memberController = new MemberController();
        articleController = new ArticleController();
    }

}
