package com.Spring.Start.Lesson_18_Servlet_filter_kyku;

public class INFO {
    //TODO:     **************************************************************************************
    //TODO:     * Мета: * Створити Servlet and cookie and page які дозволені тільки залогіненим users *
    //TODO:     **************************************************************************************
    //TODO:     Apache Tomcat - це контейнер Servlet із їхньогою реалізацією
    //TODO:     Servlet - це абстракція яка служить механізмам щоб приймати і обробляти запроси в часності реалізуэться HTTP Servlet
    //TODO:     Spring Boot - містить в собі контейнер який відповідає за те щоб слухати запроси.
    //TODO:             Він виступає Web-server. А виконюэ він це томуо реалізує специфікацію Servlet.
    //TODO:     Spring MVC - Servlet stack
    //TODO:     Spring WebFlux - Reactive stack
    //TODO:     HTTPServlet - клас із стандартними методами для створення Servlet
    //TODO:         doGet  - метод класса HTTPServlet аналог Get запроса
    //TODO:         doPost - метод класса HTTPServlet аналог Post запроса
    //TODO:     @WebServlet() - кажить що тут э servlet по даному url
    //TODO:     ---------------------------------------------------------------------------------------------------
    //TODO:     HTTP - stateless (кожен запрос розглядаэться окремо, тобто сервер нічого не знає про минулий запрос, який зробив user
    //TODO:                         знаэ тільки про дійсний який обробляється прямо зараз. І при ситуації коли на сервер іде велика кільксть запросів
    //TODO:                           наша задача розробити логіка для оприділення що кожен запрос іде він одного user)
    //TODO:     1. user -> login/password
    //TODO:     2. server -> read data(дані user) -> if success true
    //TODO:     3. server -> client COOCKIE (у яких э мітка user)
    //TODO:     4. client -> request -> server (перед тим як його обробляти, ми пишемо деякий механізм/фільтр,
    //TODO:                                     який буде оприділяти з request достаэмо COOCKIE для опридылення чи наш це user  )
    //TODO:     User логінеться на сайт,а server провіряє дані, якщо вони співпадають
    //TODO:     і user видаэ сабе за того ким і являється, server у свою чергу повертає user зашифорованы coockie
    //TODO:     у яких містяться дані цього юзера і коли при подальшій роботі user буде подавати запит на сервер
    //TODO:     до кожного його запиту прикручуються coookie і server перш ніж обротити запит, провіряє coockie user у яких місяться дані про цьогож user, якщо вони
    //TODO:     співпадають server обробляє запит і повертає назад user...
    //TODO:     Таким нами створеним механізмом, який провіряє на те що юзер являється тим ким являється
    //TODO:     вирішується проблема STATELESS.
    //TODO:     ----------------------------------------------------------------------------------------------------------
    //TODO:     Для того щоб створити сервлет потрібно
    //TODO:     1)  Створити Packages controller
    //TODO:         Створити ServletController
    //TODO:        Servlet який буде видний тільки user які мають coockie
    //TODO:         @GetMapping("/servlet")
    //TODO:         public String gethome(Model model) {
    //TODO:              model.addAttribute("message","ook, u can do it");
    //TODO:              return "servlet";
    //TODO:          }
    //TODO:              Servlet який буде створювати coockie для user
    //TODO:          @GetMapping("/cookie")
    //TODO:          public String getCookie(HttpServletResponse response){
    //TODO:              response.addCookie(new Cookie("dima","dima"));
    //TODO:              return "cookie";
    //TODO:          }
    //TODO:         ----------------------------------------------------------------------------------------------------------
    //TODO:          2)  Створити Packages filter
    //TODO:         Створити Filter
    //TODO:         Описуэмо doFilter, яки потрыбен нам для провірки на те що user міститься в масиві залогінених users
    //TODO:          public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    //TODO:        HttpServletRequest request = (HttpServletRequest) servletRequest;
    //TODO:        HttpServletResponse response = (HttpServletResponse) servletResponse;
    //TODO:
    //TODO:        Cookie[] arrayCokies = request.getCookies(); - масив у якому мустяться user
    //TODO:        boolean checkit = false;
    //TODO:
    //TODO:        if(arrayCokies == null) { - якщо масив пустий видати page image
    //TODO:            response.sendRedirect("image");
    //TODO:        }
    //TODO:          провірка на наявність user у масиві залогінених users
    //TODO:        for(Cookie cokie : arrayCokies){
    //TODO:            if(cokie.getName().equals("dima")) checkit = true;
    //TODO:        }
    //TODO:        //filterChain - я дозволяю ыти далы
    //TODO:        if(checkit) {
    //TODO:            filterChain.doFilter(request,response);
    //TODO:        }
    //TODO:        //якщо куки нема, робимо редірект
    //TODO:        else {
    //TODO:            response.sendRedirect("image");
    //TODO:                }
    //TODO:          }
    //TODO:         ---------------------------------------------------------------------------------------
    //TODO:         3) Створити Packages conf
    //TODO:         Створити Conf
    //TODO:         Заєриструю bean
    //TODO:              @Bean
    //TODO:         public FilterRegistrationBean<Filter> filterFilterRegistrationBean () {
    //TODO:        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
    //TODO:        filterFilterRegistrationBean.setFilter(new Filter());
    //TODO:        filterFilterRegistrationBean.addUrlPatterns("/home");
    //TODO:        return filterFilterRegistrationBean;
    //TODO:      }
    //TODO:     --------------------------------------------------------------------------------------------
    //TODO:
    //TODO:
    //TODO:
    //TODO:
    //TODO:
    //TODO:
    //TODO:
    //TODO:



}
