import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NotFoundComponent } from './shared/not-found/not-found.component';


const routes: Routes = [
  {path: '', redirectTo: 'login', pathmatch: 'full' },
  {path: '404', component: NotFoundComponent },
];


@NgModule({
  imports: [RouterModule.forRoute(routes, {relativeLinkResolution: 'legacy'}) ],
  exports: [RouterModule],
})
export class AppRoutingModule {}
