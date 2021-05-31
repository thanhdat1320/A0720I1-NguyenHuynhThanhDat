import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../../_04_components-interaction/exercise/prj-training/ngmodule-dependency-injection/src/app/auth.service';

@Component({
  selector: 'app-content-projection',
  templateUrl: './content-projection.component.html',
  styleUrls: ['./content-projection.component.scss'],
  // providers: [AuthService]
  viewProviders: [AuthService]
})
export class ContentProjectionComponent implements OnInit {

  constructor(public authService: AuthService) { }

  ngOnInit() {
  }

}
