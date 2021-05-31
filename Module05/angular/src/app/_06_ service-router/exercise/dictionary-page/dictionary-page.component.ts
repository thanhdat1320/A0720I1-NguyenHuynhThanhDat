import { Component, OnInit } from '@angular/core';
import { DictionaryService, IWord } from '../../../_04_components-interaction/exercise/prj-training/angular-service-router/src/app/dictionary.service';
import { AuthService } from '../../../_04_components-interaction/exercise/prj-training/angular-service-router/src/app/auth.service';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.scss']
})
export class DictionaryPageComponent implements OnInit {
  listWord: IWord[] = [];
  constructor(
    private dictionaryService: DictionaryService,
    public authService: AuthService
    ) { }

  ngOnInit() {
    this.listWord = this.dictionaryService.getAll();
  }

}
