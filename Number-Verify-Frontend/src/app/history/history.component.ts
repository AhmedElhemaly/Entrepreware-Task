import { Numberz } from './../numberz';
import { NumVerifyService } from './../num-verify.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent implements OnInit {
  numz: Numberz[];
  constructor(private numService: NumVerifyService) { }

  ngOnInit(): void {
    this.getHistory();
    console.log(this.numz);
  }
  getHistory()
  {
    this.numService.history().subscribe(data=>{
      this.numz=data;
    })
  }

}
