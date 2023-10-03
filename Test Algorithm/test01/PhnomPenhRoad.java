import java.util.List;

public class PhnomPenhRoad 
{
    public void main(String[] args)
    {
                //Khan 7Makara
        //Start Location
        Node Oreousey3 = new Node("Oreousey3 (HoteSor)");
        Node FiveMakaraBridge = new Node("5Makara Bridge");
        Node SangkatSenMonoroum = new Node("Sangkat Sen Monoroum");
        Node KampucheaKrom114 = new Node("Kampuchea Krom(114)");
        Node IFLInstitute = new Node("IFL Institute");
        Node NaeruBlvd215 = new Node("Naeru Blvd(215)") ;
        Node PrasatPichStop = new Node("Prasat Pich Stop(93)");
        Node TwoDeersAH11 = new Node("TwoDeersAH11");
        Node BKC114 = new Node("BKC(114)");
        Node AngtoekOlympic = new Node("Angtoek Olympic");
        Node MohamontreyPagoda274 = new Node("MohamontreyPagoda(274) ");

        //Finish Location
        Node ChenlaStop217 = new Node("Chenla Stop(217)");
        Node SevenMakaraBridge = new Node("7 Makara Bridge");
        Node Road227 = new Node("Road 227");
        Node Road262 = new Node("Road 262");
        Node PhsarSamNang12 = new Node("Phsar Samnang12(171)");
        Node Zadergold_Tepporn = new Node("Zadergold + Tep porn");
        Node PetChenStop93 = new Node("PetChen Stop(93)");
        Node SampovMeasRoundabout = new Node("Sampov Meas Roundabout(161+143)");

                //Boeng KaengKong
        //Start Location
        Node StoengmeancheyBridge = new Node("Stoeng Meanchhey Bridg");
        Node SeyhanoukVilleBlvd = new Node("Seyhanouk Ville blvd(274)");
        Node Panhasastra310 = new Node("Panhasastra(310)");
        Node MunyrethBlvd217 = new Node("Munyreth Blvd(217)");
        Node Canadia = new Node("Canadia(284)");

        //Finish Location
        Node Norodom_Sothearost = new Node("Norodom + Sothearost");
        Node Road432 = new Node("Road (432)");
        Node NationalAssemblyRoad = new Node("National Assembly Road");
        Node ChinaEmbassy245 = new Node("China Embassy(245)");
        Node MaoSetoung245 = new Node("Mao Setoung(245)");
        Node Road348 = new Node("Road (348)");
        Node ToulSvayPreySchool = new Node("Toul Svay Prey School");

                //Daun Penh
        //Start Location
        Node SamdachChournNathRoundabout = new Node("Samdach Chourn Nath Roundabout");
        Node IndependenceMonument = new Node("Independence Monument (268+274)");
        Node WatPhnomRoundabout41 = new Node("Wat Phnom Roundabout(41)");
        Node France47 = new Node("France(47)");
        Node MonyVonBlvd93 = new Node("Monyvong Blvd");
        Node PreahSokunmeanbonBlvd = new Node("PreahSokunmeanbon Blvd");
        Node PrasatPichStop93 = new Node("Prasat Pich Stop(93)");
        Node SoramrithBlvd268 = new Node("Soramrith Blvd");
        Node SisowathBlvd = new Node("Sisowath Blvd");
        Node KramournSor114 = new Node("kramournSor(114)");
        Node SilenMarket274 = new Node("Silen Market(274)");

        //FInish Location
        Node ChroyChangvarBridgeAH11 = new Node("Chroy Changvar Bridge(AH11)");
        Node KourchKanongRoundabout = new Node("Kourch Kanong Roundabout");
        Node AngdourngBlvd110 = new Node("Angdourng Blvd(110)");
        Node NationalMuseumStop41 = new Node("National Museum Stop(41)");
        Node SisowattBlvd = new Node("Sisowatt Blvd");
        Node PsarThomThmey = new Node("Psar Thom Thmey");
        Node LangkaPagoda74 = new Node("Langka Pagoda(274)");

                //Toul Kork
        //Start Location
        Node CamkoRoundabout355 = new Node("Camko Roundabout(355)");
        Node RussianFederationDominoPizzaAH11 = new Node("Russian Federation (Domino Pizza(AH11))");
        Node DepotMarketStop215 = new Node("Depot Market Stop(215)");

        //Finish Location
        Node OknhaKlaengMoeurng70 = new Node("Oknha Klaeng Moeurng(70)");
        Node Road379 = new Node("Road(379)");
        Node Road261 = new Node("Road(261)");
        Node Road271 = new Node("Road (271)");
        Node Road253 = new Node("Road(253)");

                //Russey Keo
        Node CamkoRoundabout = new Node("Camko Roundabout");
        Node PumpingStationToulKork273 = new Node("Pumping Station Toul Kork(273)");

        //Finish Location
        Node TumnupKobsrov = new Node("Tumnup Kobsrov");
        Node AngkorPhnomPenhCityPark = new Node("Angkor Phnom Penh City Park");
        Node ToulSantevornPagoda = new Node("Toul Santevorn Pagoda");
        Node CheaSophara598 = new Node("Chea Sophara(598)");

                //Dangkor
        //Start Location
        Node ChamKadong217 = new Node("Chamkadong(217)");

        //Finish Location
        Node Tumnup7MakaraNode = new Node("Tumnup 7 Makara Road");

                //Porsen Chey
        //Start Location
        Node ThnalBamBaekAH11 = new Node("Thnal Bam Baek(AH11)");
        Node RoadAH11 = new Node("Road(AH11)");

        //Finish Location
        Node SecondSteoungMeanchey = new Node("2nd SteoungMeanchey(217)");
        Node TrapaengChhouk271 = new Node("trapaengChhouk(271)");

                //Prek Phnov
        //Start Location
        Node TumnoupKobsrov_SvayPark = new Node("Tumnoup Kobsrov(Svay Park)");
        Node SovanThormreach130 = new Node("Sovan Thormreach(130)");

        //Finish Location
        Node PrasethMountain_KampongSpeu = new Node("Praseth mountain(Kampong Speu)");
        Node KhanKambol = new Node("Khan Kambol");

                //Kambol
        //Strat Location
        Node CheyChoumnaek_railway = new Node("Chey Choumnaek(railway)");
        //Finish Location
        Node BrataekLangNo3 = new Node("Brataek Lang(No3)");


                //Chroy Changvar
        //Start Location
        Node PromBayonStatue  = new Node("Prom Bayon statue");

        //Finish Location
        Node MukKampoulDistrict_Kandal = new Node("Muk Kampoul district(Kandal)");
        Node TonleMekongRoad = new Node("Tonle Mekong road");

                //Chbar Ampov
        //Start Location
        Node KbalThnalBridge = new Node("Kbal Thnal Bridge");
        Node ChampousKaek = new Node("Champous Kaek");

        //Finish Location 
        Node KeanSvay = new Node("Kean Svay");
        Node RoadNo1 = new Node("Road Number1");

                //Steoung Meanchey
        //Start Location
        Node StoeungMeanCheyBridge = new Node("Stoeung Mean Chey Bridge");
        Node ChamkarDong217 = new Node("Chamkar Dong(217)");
        Node HunNeang271 = new Node("Hun Neang(217)");
        Node SecondRingRoad = new Node("2(nd) Ring Road");
        Node TakmaoRoundabout = new Node("Takmao Roundabout");

                //Sen Sok
        //Start Location
        Node OkhnaTrihengSobenChamkarPringGarden = new Node("Okhna Triheng(Soben Chamkar Pring Garden)");
        Node SounSobenChamkarPring1928 = new Node("Soun Soben Chamkar Pring(1928)");
        Node PsarDeyhoyStop = new Node("Psar Deyhoy Stop");
        Node BayabVillage1928 = new Node("Bayab Village(1928)");
        Node OkhnaTriheng = new Node("Okhna Triheng");
        Node Hanoy1019 = new Node("Hanoy(1019)");
        Node SangkatTrapaengKrasangAH11 = new Node("Sangkat Trapaeng Krasang (AH11)");

        //Finish Location
        Node CamkoRoundaboutCheaSophara598_355 = new Node("Camko Roundabout(Chea Sophara 598/355");
        Node SovanPhum2004 = new Node("SovanPhum(2004)");
        Node Road598 = new Node("Road 598");
        Node AngkorBlvd = new Node("Angkor Blvd");
        Node TumnupKobsrovStreet = new Node("Tumnup Kobsrov Street");
        Node KrangAngkrong2011 = new Node("Krang Angkrong(2011)");

                //Chamkar Morn
        //Start Location
        Node StopToulTumpoung245 = new Node("Stop Toul Tumpoung(245)");
        Node PsarDermtkovRoundabout = new Node("Psar Dermtkov Roundabout");
        Node SenateStop245 = new Node("Senate Stop(245)");
        Node PreahMonivongBlvd93 = new Node("Preah Monivong Blvd(93)");
        Node MinistryOfInterior = new Node("Ministry of Interior");
        Node AeonMall01_3 = new Node("Aeon Mall 01(3)");
        Node RainbowBridgeKohPich = new Node("Rainbow Bridge(Koh Pich)");
        Node ChamkarmornStop_Maosetung_245 = new Node("Chamkarmorn Stop(Maosetung 245)");
        Node ChinaEmbassy = new Node("China Embassy");
        Node BayonMotor432 = new Node("Bayon Motor432");
        //Finish Location
        Node PsarDermtkovRoundabout488 = new Node("Psar Dermtkov Roundabout(488)");
        Node BoengTrabaekSchool93 = new Node("Boeng Trabaek School(93)");
        Node RoyalAdministrationSchool466 = new Node("Royal Administration School(466)");
        Node TrasorkPaem63 = new Node("Trasork Paem(63)");
        Node MinistryOfInterior41 = new Node("Ministry of Interior(41)");
        Node KohPichStreet = new Node("Koh Pich Street");
        Node EvenArea = new Node("Even Area");
        Node SwanBridge78 = new Node("Swan Bridge(78)");
        Node Seyhanoukville274 = new Node("Seyhanoukvlle(274)");
        Node Street430 = new Node("Street(430)");
        Node PsarDermthkov = new Node("Psar Dermthkov(488)");







































       







    }
}
