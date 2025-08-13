package boundedContext.base.servlet;

import boundedContext.article.controller.ArticleController;
import boundedContext.base.controller.Container;
import boundedContext.global.base.Rq;
import boundedContext.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//디스패처서블릿이란 말그대로 각각의 컨트롤러 전송하기 위한 하나의 병원창구라고 생각하자(병원창구에서 무슨 진단과로 가라고 알려주니까)
// TODO 2강 진행하자.
@WebServlet("/usr/*") // 유저로 들어온 모든 요청
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        MemberController memberController = Container.memberController;
        ArticleController articleController = Container.articleController;

        String url = req.getRequestURI();

        switch (url) {
            case "/usr/article/list" -> articleController.showList(rq);
            case "/usr/member/join" -> memberController.showJoin(rq);
        }
    }
}
