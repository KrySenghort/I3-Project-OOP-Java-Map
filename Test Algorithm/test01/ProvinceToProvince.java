import java.util.List;

public class ProvinceToProvince 
{
    public static void main(String[] args)
    {
        Node node1 = new Node("Banteay Meanchey");
        Node node2 = new Node("Battambang");
        Node node3 = new Node("Kampong Cham");
        Node node4 = new Node("Kampong Chhang");
        Node node5 = new Node("Kampong Speu");
        Node node6 = new Node("Kampong Thom");
        Node node7 = new Node("Kampot");
        Node node8 = new Node("Kandal");
        Node node9 = new Node("Koh Kong");
        Node node10 = new Node("Kratie");
        Node node11 = new Node("Mondulkiri");
        Node node12 = new Node("Phnom Penh");
        Node node13 = new Node("Preah Vihear");
        Node node14 = new Node("Prey Veng");
        Node node15 = new Node("Pursat");
        Node node16 = new Node("Ratanakiri");
        Node node17 = new Node("Siem Reap");
        Node node18 = new Node("Sihanoukville");
        Node node19 = new Node("Stung Treng");
        Node node20 = new Node("Svay Reing");        
        Node node21 = new Node("Takeo");
        Node node22 = new Node("Oddar Meanchey");
        Node node23 = new Node("Kep");
        Node node24 = new Node("Pailin");
        Node node25 = new Node("Tboung Khmum");
        
        // node12.addNeighbour(new Edge(node1, 147));//pp->bm
        // node12.addNeighbour(new Edge(node2, 291));//pp->btb
        // node12.addNeighbour(new Edge(node3, 126));//pp->kpc
        // node12.addNeighbour(new Edge(node4, 91));//pp->kpch
        // node12.addNeighbour(new Edge(node5, 45));//pp->kps
        // node12.addNeighbour(new Edge(node6, 168));//pp->kpt
        // node12.addNeighbour(new Edge(node7, 147));//pp->kmpt
        // node12.addNeighbour(new Edge(node9, 290));//pp->kk
        // node12.addNeighbour(new Edge(node10, 336));//pp->kt
        // node12.addNeighbour(new Edge(node11, 381));//pp->mdkr
        // node12.addNeighbour(new Edge(node12, 0));//pp->pp
        // node12.addNeighbour(new Edge(node13, 300));//pp->prhvh
        // node12.addNeighbour(new Edge(node14, 90));//pp->pryv
        // node12.addNeighbour(new Edge(node15, 184));//pp->pur
        // node12.addNeighbour(new Edge(node16, 588));//pp->rtnkr
        // node12.addNeighbour(new Edge(node17, 312));//pp->sr
        // node12.addNeighbour(new Edge(node18, 226));//pp->shnvl
        // node12.addNeighbour(new Edge(node19, 468));//pp->steutrg
        // node12.addNeighbour(new Edge(node20, 125));//pp->svyrg
        // node12.addNeighbour(new Edge(node21, 77));//pp->takeo
        // node12.addNeighbour(new Edge(node22, 441));//pp->ordmchy
        // node12.addNeighbour(new Edge(node23, 147));//pp->kep
        // node12.addNeighbour(new Edge(node24, 394));//pp->pai
        // node12.addNeighbour(new Edge(node25, 172));//pp->tbgkhum

        node12.addNeighbour(new Edge(node8, 11));//pp->kandal
        node8.addNeighbour(new Edge(node3, 195));//kandal->kampongcham
        node8.addNeighbour(new Edge(node14, 90));//kandal->preyveng
        node8.addNeighbour(new Edge(node21, 83.1));//kandal->takeo
        node8.addNeighbour(new Edge(node3, 113));//kandal->kampongspeu
        node8.addNeighbour(new Edge(node3, 169));//kandal->kampongchhang

        node21.addNeighbour(new Edge(node7, 89.6));//takeo->kampot
        node21.addNeighbour(new Edge(node5, 84.7));//takeo->kampongspeu

        node5.addNeighbour(new Edge(node18, 178));//kampongspeu->sihanoukville
        node5.addNeighbour(new Edge(node7, 125));//kampongspeu->kampot
        node5.addNeighbour(new Edge(node9, 243));//kampongspeu->kohkong
        node5.addNeighbour(new Edge(node15, 172));//kampongspeu->pursat
        node5.addNeighbour(new Edge(node4, 111));//kampongspeu->kampongchhnang

        node7.addNeighbour(new Edge(node23, 22.6));//kampot->kep
        node7.addNeighbour(new Edge(node18, 99.4));//kampot->sihanoukville

        node18.addNeighbour(new Edge(node9, 232));//sihanoukville->kohkong

        node9.addNeighbour(new Edge(node15, 229));//kohkong->pursat

        node15.addNeighbour(new Edge(node2, 116));//pursat->btb
        node15.addNeighbour(new Edge(node4, 106));//pursat->kampongchhang
        node15.addNeighbour(new Edge(node6, 289));//pursat->kampongthom
        node15.addNeighbour(new Edge(node17, 284));//pursat->siemreap

        node2.addNeighbour(new Edge(node24,84.1));//btb->pailin
        node2.addNeighbour(new Edge(node17, 163));//btb->sr
        node2.addNeighbour(new Edge(node1, 68.5));//btb->banteaymeanchey

        node1.addNeighbour(new Edge(node17, 105));//banteaymeanchey->sr
        node1.addNeighbour(new Edge(node22, 126));//banteaymeanchey->oddarmeanchey

        node22.addNeighbour(new Edge(node17, 138));//oddarmeanchhey->sr
        node22.addNeighbour(new Edge(node13, 237));//oddarmeanchhey->preahvihear

        node17.addNeighbour(new Edge(node6, 158));//sr->kampongthom
        node17.addNeighbour(new Edge(node13, 171));//sr->preahvihear

        node13.addNeighbour(new Edge(node6, 156));//preahvihear->kampongthom
        node13.addNeighbour(new Edge(node19, 125));//preahvihear->stung treng

        node6.addNeighbour(new Edge(node19, 248));//kpt->stung treng
        node6.addNeighbour(new Edge(node4, 66.6));//kpt->kampong chhnang
        node6.addNeighbour(new Edge(node3, 103));//kpt->kampongcham
        node6.addNeighbour(new Edge(node10, 177));//kpt->kratie

        node3.addNeighbour(new Edge(node19, 153));//kampongcham->kampong chhnang
        node3.addNeighbour(new Edge(node14, 75.9));//kampongcham->preyveng
        node3.addNeighbour(new Edge(node25, 47.2));//kampongcham->tboungkhmum
        node3.addNeighbour(new Edge(node10, 121));//kampongcham->Kratie

        node25.addNeighbour(new Edge(node14, 90.6));//tboungkhmum->preyveng
        node25.addNeighbour(new Edge(node10, 93.9));//tboungkhumum->kratie

        node14.addNeighbour(new Edge(node20, 81.1));//preyveng->svayrieng

        node10.addNeighbour(new Edge(node11, 216));//kratie->mondulkiri
        node10.addNeighbour(new Edge(node19, 135));//kratie->stungtreng

        node16.addNeighbour(new Edge(node11, 187));//ratanakiri->mondulkiri
        node10.addNeighbour(new Edge(node19, 135));//ratanakiri->stungTreng

        node19.addNeighbour(new Edge(node11, 320));//stungtreng->mondulkiri

        AStarAlgo algorithm = new AStarAlgo();
        algorithm.aStarSearch(node12, node17);

        List<Node> path = algorithm.printPath(node17);

        System.out.println(path);
    }
}
