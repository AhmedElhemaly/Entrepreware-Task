import { HistoryComponent } from './history/history.component';
import { NumVerifyComponent } from './num-verify/num-verify.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path:'num-verify', component : NumVerifyComponent},
  {path:'history', component: HistoryComponent},
  {path:'',redirectTo:'num-verify',pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
