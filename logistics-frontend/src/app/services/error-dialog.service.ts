import { Injectable } from '@angular/core';
import { MatDialog } from 'angular/material/dialog';
import { ErrorDisplayComponent } from '../shared/error-display/error-display.component';

@Injectable({
  providedIn: 'root'
})
export class ErrorDialogService {
  private opened = false;

  constructor(private dialog: MatDialog) {}

  openDialog(message: string, status?: number): void {
    if (!this.opened) {
      this.opened = true;
      const dialogRef = this.dailog.open(ErrorDisplayComponent, {
        data: {message, status },
        maxHeight: '100%' ,
        width: '540%' ,
        maxWidth: '100%' ,
        disableClose: true,
        hasBackdrop: true,
      });

      dialogRef.afterClosed().subscribe(() => {
        this.opened = false;
      });
    }
  }
}
