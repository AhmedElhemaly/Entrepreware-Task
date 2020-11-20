import { Numberz } from './../numberz';
import { NumVerifyService } from './../num-verify.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-num-verify',
  templateUrl: './num-verify.component.html',
  styleUrls: ['./num-verify.component.css']
})
export class NumVerifyComponent implements OnInit {

  number: string;
  numobJ: Numberz;
  mobNumberPattern = "^(\\+20-?)[0-9]{10}$";  
  constructor(private router:Router, private route:ActivatedRoute,private numService:NumVerifyService ) { }

  ngOnInit(): void {
    this.numobJ = new Numberz();
    this.number = this.route.snapshot.params['number'];
    this.onSubmit();
  }
  
  onSubmit()
  {
    this.numService.validateNumber(this.number).subscribe(data =>{
      this.numobJ=data;
    },error=>console.log(error));
  }

}
