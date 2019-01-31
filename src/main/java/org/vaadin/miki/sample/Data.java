package org.vaadin.miki.sample;

/**
 * @author miki
 * @since 2019-01-31
 */
public class Data {

    private int id;

    private String name;

    private String description;

    public Data(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final Data[] getData() {
        return new Data[] {
            new Data(1, "title", "Powszechna Deklaracja Praw Człowieka"),
            new Data(2, "part 1", " Artykuł 1\n"
                                         + "Wszystkie istoty ludzkie rodzą się wolne i równe w godności i prawach. Są one obdarzone rozumem i sumieniem oraz powinny postępować w stosunku do siebie wzajemnie w duchu braterstwa.\n"
                                         + "\n" + "Artykuł 2\n"
                                         + "Każda osoba jest uprawniona do korzystania ze wszystkich praw i wolności ogłoszonych w niniejszej Deklaracji bez jakiejkolwiek różnicy, zwłaszcza ze względu na rasę, kolor skóry, płeć, język, religię, poglądy polityczne lub jakiekolwiek inne, pochodzenie narodowe lub społeczne, majątek, urodzenie lub jakąkolwiek inną sytuację (ang. or other status; franc. ou de toute autre situation).\n"
                                         + "Ponadto, nie powinno się czynić żadnego rozróżnienia na podstawie statusu politycznego, prawnego lub międzynarodowego kraju lub terytorium, do którego dana osoba przynależy, bez względu na to, czy ów kraj lub terytorium jest niepodległe, powiernicze, zależne albo poddane jakimkolwiek ograniczeniom suwerenności.\n"
                                         + "\n" + "Artykuł 3\n" + "Każda osoba ma prawo do życia, wolności i bezpieczeństwa osobistego.\n" + "\n"
                                         + "Artykuł 4\n"
                                         + "Nikt nie może być utrzymywany w niewolnictwie lub poddaństwie; niewolnictwo i handel niewolnikami są zakazane we wszelkich ich formach.\n"
                                         + "\n" + "Artykuł 5\n"
                                         + "Nikt nie może być poddawany torturom albo okrutnemu, nieludzkiemu lub poniżającemu traktowaniu lub karaniu.\n"
                                         + "\n" + "Artykuł 6\n" + "Każdy jest uprawniony do uznawania wszędzie jego osobowości prawnej.\n" + "\n"
                                         + "Artykuł 7\n"
                                         + "Wszyscy są równi wobec prawa i są uprawnieni bez jakiejkolwiek dyskryminacji do równej ochrony prawnej. Wszyscy są uprawnieni do równej ochrony przed jakąkolwiek dyskryminacją sprzeczną z niniejszą Deklaracją oraz przed jakimkolwiek podżeganiem do takiej dyskryminacji.\n"
                                         + "\n" + "Artykuł 8\n"
                                         + "Każda osoba ma prawo do skutecznego odwołania się do kompetentnych sądów krajowych przeciwko czynom naruszającym prawa podstawowe przyznane jej przez konstytucję lub ustawy.\n"
                                         + "\n" + "Artykuł 9\n" + "Nikt nie może podlegać arbitralnemu zatrzymaniu, aresztowaniu lub wygnaniu.\n" + "\n"
                                         + "Artykuł 10\n"
                                         + "Każda osoba jest uprawniona, na warunkach pełnej równości, by jej sprawa była sprawiedliwie i publicznie rozpatrzona przez niezawisły i bezstronny sąd, który zadecyduje o jej prawach i obowiązkach albo o zasadności jakiegokolwiek oskarżenia w sprawie karnej skierowanej przeciwko niej.\n"
                                         + "\n" + "Artykuł 11\n"
                                         + "1. Każda osoba oskarżona o czyn zabroniony korzysta z domniemania niewinności, dopóki jej wina nie zostanie udowodniona zgodnie z prawem w procesie publicznym, w toku którego korzysta ona z wszelkich gwarancji koniecznych dla swej obrony.\n"
                                         + "2. Nikt nie może być uznany winnym jakiegokolwiek przestępstwa karnego z tytułu jakiegokolwiek działania lub zaniechania, które w czasie jego popełnienia nie stanowiło czynu zabronionego zgodnie z prawem krajowym lub międzynarodowym. Na nikogo też nie można nałożyć kary surowszej niż ta, która znajdowałaby zastosowanie w czasie popełnienia czynu zabronionego.\n"
                                         + "\n" + "Artykuł 12\n"
                                         + "Nikt nie będzie podlegać arbitralnemu wkraczaniu w jego życie prywatne, rodzinę, mieszkanie lub korespondencję, ani też zamachom na jego honor i reputację. Każdy jest uprawniony do ochrony prawnej przed takim wkraczaniem lub takimi zamachami.\n"
                                         + "\n" + "Artykuł 13\n"
                                         + "1. Każda osoba jest uprawniona do wolności poruszania się i osiedlania w granicach każdego Państwa.\n" + "\n"
                                         + "2. Każda osoba jest uprawniona do opuszczania jakiegokolwiek kraju, włączając swój własny kraj, jak również do powrotu do swego kraju. "),
            new Data(3, "part 2", " Artykuł 14\n"
                                            + "1. W razie prześladowania, każda osoba jest uprawniona do ubiegania się o azyl i korzystania z niego w innych krajach.\n"
                                            + "\n"
                                            + "2. Na prawo to nie można się powoływać w razie ścigania dotyczącego w istocie przestępstw pospolitych (ang. non-political crimes; franc. un crime de droit commun) albo działań sprzecznych z Celami i Zasadami Narodów Zjednoczonych.\n"
                                            + "\n" + "Artykuł 15\n" + "1. Każda jednostka ma prawo do obywatelstwa.\n" + "\n"
                                            + "2. Nikogo nie można arbitralnie pozbawiać jego obywatelstwa ani też prawa do zmiany jego obywatelstwa.\n"
                                            + "\n" + "Artykuł 16\n"
                                            + "1. Pełnoletni mężczyźni i kobiety, bez jakichkolwiek ograniczeń ze względu na rasę, narodowość lub religię, mają prawo do zawierania związku małżeńskiego i zakładania rodziny. Korzystają oni z równych praw co do zawierania małżeństwa, w czasie jego trwania i po jego rozwiązaniu.\n"
                                            + "2. Małżeństwo może być zawarte wyłącznie na podstawie dobrowolnej i pełnej zgody przyszłych małżonków.\n"
                                            + "3. Rodzina jest naturalną i podstawową komórką społeczeństwa oraz jest uprawniona do ochrony ze strony społeczeństwa i państwa.\n"
                                            + "\n" + "Artykuł 17\n"
                                            + "1. Każda osoba ma prawo do własności, zarówno indywidualnie, jak i wespół z innymi.\n" + "\n"
                                            + "2. Nikogo nie można pozbawiać arbitralnie jego własności.\n" + "\n" + "Artykuł 18\n"
                                            + "Każda osoba ma prawo do wolności myśli, sumienia i religii; prawo to obejmuje wolność zmiany swej religii lub przekonań, jak również wolność manifestowania swej religii lub przekonań, indywidualnie lub wspólnie z innymi, publicznie lub prywatnie, poprzez nauczanie, praktyki religijne, sprawowanie kultu i rytuałów.\n"
                                            + "\n" + "Artykuł 19\n"
                                            + "Każda jednostka ma prawo do wolności poglądów i wypowiedzi; prawo to obejmuje nieskrępowaną wolność posiadania poglądów oraz poszukiwania, otrzymywania i przekazywania informacji oraz idei, wszelkimi środkami i bez względu na granice.\n"
                                            + "\n" + "Artykuł 20\n" + "1. Każda osoba ma prawo do wolności pokojowego zgromadzania się i zrzeszania się.\n"
                                            + "\n" + "2. Nikogo nie wolno zmuszać, aby należał do jakiegoś zrzeszenia.\n" + "\n" + "Artykuł 21\n"
                                            + "1. Każda osoba ma prawo do udziału w rządzeniu swym krajem, bezpośrednio albo za pośrednictwem swobodnie wybranych przedstawicieli.\n"
                                            + "\n"
                                            + "2. Każda osoba korzysta z prawa dostępu, na warunkach równości, do służby publicznej w swoim kraju.\n"
                                            + "\n"
                                            + "3. Wola ludu ma być podstawą władzy rządu; wola ta winna się przejawiać w periodycznych i uczciwie przeprowadzanych wyborach, na warunkach powszechności i równości, w głosowaniu tajnym albo w równoznacznym trybie zapewniającym wolność głosowania.\n"
                                            + "\n" + "Artykuł 22\n"
                                            + "Każda osoba jako członek społeczeństwa ma prawo do zabezpieczenia społecznego, jak również jest uprawniona do urzeczywistnienia, dzięki wysiłkowi krajowemu i współpracy międzynarodowej, jej praw gospodarczych, socjalnych i kulturalnych, niezbędnych dla jej godności oraz dla swobodnego rozwoju jej osobowości.\n"
                                            + "\n" + "Artykuł 23\n"
                                            + "1. Każdy ma prawo do pracy, do swobodnego wyboru zatrudnienia, do słusznych i dogodnych (ang. just and favourable; franc. equitables et satisfaisantes) warunków pracy, jak również do ochrony przed bezrobociem.\n"
                                            + "\n" + "2. Każdy bez jakiejkolwiek dyskryminacji, ma prawo do równej płacy za równą pracę.\n" + "\n"
                                            + "3. Każdy, kto pracuje, ma prawo do słusznego i zadowalającego wynagrodzenia (ang. just and favourable remuneration; franc. une remuneration equitable et satisfaisante), zapewniającego jemu samemu i jego rodzinie byt odpowiadający ludzkiej godności.\n"
                                            + "\n"
                                            + "4. Dla ochrony swych interesów, każdy ma prawo do tworzenia związków zawodowych i przystępowania do nich.\n"
                                            + "\n" + "Artykuł 24\n"
                                            + "Każda osoba ma prawo do odpoczynku i do czasu wolnego, a zwłaszcza do rozsądnego ograniczenia czasu pracy oraz do okresowych płatnych urlopów.\n"
                                            + "\n" + "Artykuł 25\n"
                                            + "1. Każda osoba ma prawo do poziomu życia odpowiadającego potrzebom zdrowia i dobrobytu jej samej i jej rodziny, włączając wyżywienie, ubiór, mieszkanie, opiekę medyczną i niezbędne świadczenia społeczne, jak również prawo do zabezpieczenia na wypadek bezrobocia, choroby, niezdolności do pracy, wdowieństwa, podeszłego wieku, a także innych przyczyn utraty środków utrzymania w następstwie okoliczności niezależnych od jej woli.\n"
                                            + "\n"
                                            + "2. Macierzyństwo i dzieciństwo korzystają z prawa do specjalnej opieki i pomocy. Wszystkie dzieci, małżeńskie i pozamałżeńskie, korzystają z jednakowej ochrony socjalnej.\n"
                                            + "\n" + "Artykuł 26\n"
                                            + "1. Każda osoba ma prawo do nauki. Nauczanie powinno być nieodpłatne, przynajmniej w zakresie kształcenia podstawowego. Wykształcenie podstawowe jest przymusowe. Wykształcenie techniczne i zawodowe ma być powszechnie dostępne, a wykształcenie wyższe ma być dostępne na równi dla wszystkich na podstawie rzeczywistych osiągnięć.\n"
                                            + "\n"
                                            + "2. Nauczanie winno mieć na względzie pełny rozwój osobowości ludzkiej oraz umacnianie poszanowania praw człowieka i podstawowych wolności. Powinno ono służyć popieraniu zrozumienia, tolerancji i przyjaźni między wszystkimi narodami oraz wszystkimi grupami rasowymi lub religijnymi, jak również powinno wspierać działalność Narodów Zjednoczonych dla utrzymania pokoju.\n"
                                            + "\n"
                                            + "3. Rodzice korzystają z prawa pierwszeństwa, jeśli chodzi o wybór rodzaju wykształcenia dla swych dzieci.\n"
                                            + "\n" + "Artykuł 27\n"
                                            + "1. Każda osoba ma prawo do swobodnego uczestnictwa w życiu kulturalnym wspólnoty, do korzystania ze sztuki oraz do współuczestnictwa w postępie naukowym i płynących zeń korzyściach.\n"
                                            + "\n"
                                            + "2. Każdy ma prawo do ochrony jego interesów moralnych i majątkowych wynikających z jakiejkolwiek twórczości naukowej, literackiej lub artystycznej, której jest autorem.\n"
                                            + "\n" + "Artykuł 28\n"
                                            + "Każda osoba jest uprawniona do porządku społecznego i międzynarodowego, zapewniającego możność pełnego urzeczywistnienia praw i wolności ustalonych w niniejszej Deklaracji.\n"
                                            + "\n" + "Artykuł 29\n"
                                            + "1. Każda jednostka ma obowiązki wobec wspólnoty, bo tylko w niej możliwy jest swobodny i pełny rozwój jej osobowości.\n"
                                            + "\n"
                                            + "2. W korzystaniu ze swych praw i wolności, każdy podlega jedynie takim ograniczeniom, które są określone przez prawo, wyłącznie w celu zapewnienia należytego uznania i poszanowania praw i wolności innych, oraz zaspokojenia słusznych wymagań moralności, porządku publicznego i powszechnego dobrobytu w społeczeństwie demokratycznym.\n"
                                            + "\n"
                                            + "3. Te prawa i wolności w żadnym razie nie mogą być wykorzystywane wbrew Celom i Zasadom Narodów Zjednoczonych.\n"
                                            + "\n" + "Artykuł 30\n"
                                            + "Żadnego postanowienia w niniejszej Deklaracji nie wolno interpretować jako domniemania na rzecz państwa, grupy lub osoby jakiegokolwiek prawa do zaangażowania się w jakąkolwiek działalność albo do dokonania jakiegokolwiek czynu zmierzającego do zniszczenia (ang. destruction; franc. destruction) któregokolwiek z ogłoszonych tu praw i wolności. ")
        };
    }
}
